package code.base.omio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class CacheKeyUtils {

    public List<String> getRelatedCacheKeys(String cacheKeyToDelete) {
        List<String> relatedCacheKeys = new ArrayList<>();
        CacheKey cacheKey = toCacheKeyObject(cacheKeyToDelete);
        //senior
        int seniorCount = cacheKey.getSeniorCount();
        int index = seniorCount;
        while (calculatePassengerCountLessThan9(cacheKey)) {
            index++;
            cacheKey.setSeniorCount(index);
            relatedCacheKeys.add(toCacheKeyString(cacheKey));
        }
        cacheKey.setSeniorCount(seniorCount);

        //adult
        int adultCount = cacheKey.getAdultCount();
        index = adultCount;
        while (calculatePassengerCountLessThan9(cacheKey)) {
            index++;
            cacheKey.setAdultCount(index);
            relatedCacheKeys.add(toCacheKeyString(cacheKey));
        }
        cacheKey.setAdultCount(adultCount);

        //youth
        int youthCount = cacheKey.getYouthCount();
        index = youthCount;
        while (calculatePassengerCountLessThan9(cacheKey)) {
            index++;
            cacheKey.setYouthCount(index);
            relatedCacheKeys.add(toCacheKeyString(cacheKey));
        }
        cacheKey.setYouthCount(youthCount);

        //child
        int childCount = cacheKey.getChildCount();
        index = childCount;
        while (calculatePassengerCountLessThan9(cacheKey)) {
            index++;
            cacheKey.setChildCount(index);
            relatedCacheKeys.add(toCacheKeyString(cacheKey));
        }
        cacheKey.setChildCount(childCount);

        return relatedCacheKeys;
    }

    private CacheKey toCacheKeyObject(String cacheKey) {
        String[] cacheKeySplits = cacheKey.split("\\|");
        CacheKey cacheKeyParts = new CacheKey();
        cacheKeyParts.setProvider(cacheKeySplits[0]);
        cacheKeyParts.setDeparturePositionId(Long.parseLong(cacheKeySplits[1]));
        cacheKeyParts.setArrivalPositionId(Long.parseLong(cacheKeySplits[2]));
        cacheKeyParts.setDepartureDate(LocalDate.parse(cacheKeySplits[3]));
        cacheKeyParts.setReturnDate(cacheKeySplits[4] == null ? null: LocalDate.parse(cacheKeySplits[4]));
        cacheKeyParts.setSeniorCount(Integer.parseInt(cacheKeySplits[5]));
        cacheKeyParts.setAdultCount(Integer.parseInt(cacheKeySplits[6]));
        cacheKeyParts.setYouthCount(Integer.parseInt(cacheKeySplits[7]));
        cacheKeyParts.setChildCount(Integer.parseInt(cacheKeySplits[8]));
        cacheKeyParts.setInfantCount(Integer.parseInt(cacheKeySplits[9]));
        cacheKeyParts.setDiscountCardHash(cacheKeySplits[10]);
        cacheKeyParts.setAbParameterHash(cacheKeySplits[11]);
        return cacheKeyParts;
    }

    private String toCacheKeyString(CacheKey cacheKey) {
        StringJoiner stringJoiner = new StringJoiner("|");
        stringJoiner.add(cacheKey.getProvider());
        stringJoiner.add(String.valueOf(cacheKey.getDeparturePositionId()));
        stringJoiner.add(String.valueOf(cacheKey.getArrivalPositionId()));
        stringJoiner.add(cacheKey.getDepartureDate().toString());
        stringJoiner.add(cacheKey.getReturnDate() == null ? null : cacheKey.getReturnDate().toString());
        stringJoiner.add(String.valueOf(cacheKey.getSeniorCount()));
        stringJoiner.add(String.valueOf(cacheKey.getAdultCount()));
        stringJoiner.add(String.valueOf(cacheKey.getYouthCount()));
        stringJoiner.add(String.valueOf(cacheKey.getChildCount()));
        stringJoiner.add(String.valueOf(cacheKey.getInfantCount()));
        stringJoiner.add(cacheKey.getDiscountCardHash());
        stringJoiner.add(cacheKey.getAbParameterHash());
        return stringJoiner.toString();
    }

    private boolean calculatePassengerCountLessThan9(CacheKey cacheKey) {
        return cacheKey.getSeniorCount()+ cacheKey.getAdultCount()+ cacheKey.getYouthCount()+ cacheKey.getChildCount()+ cacheKey.getInfantCount() < 9;
    }
}
