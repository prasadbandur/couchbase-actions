package code.base.omio;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CacheKeyUtilsTest {

    private CacheKeyUtils cacheKeyUtils = new CacheKeyUtils();

    @Test
    void for1Adult() {
        String cacheKey = "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|0|0|<discCardHash>|<abParamterHash>";
        List<String> relatedCacheKeys = cacheKeyUtils.getRelatedCacheKeys(cacheKey);

        Assertions.assertThat(relatedCacheKeys).containsExactlyInAnyOrderElementsOf(List.of(
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|1|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|3|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|4|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|5|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|6|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|7|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|8|1|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|2|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|3|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|4|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|5|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|6|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|7|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|8|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|9|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|1|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|2|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|3|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|4|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|5|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|6|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|7|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|8|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|1|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|2|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|3|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|4|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|5|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|6|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|7|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|0|1|0|8|0|<discCardHash>|<abParamterHash>"

        ));
    }

    @Test
    void for2Senior2Adult() {
        String cacheKey = "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|0|0|0|<discCardHash>|<abParamterHash>";
        List<String> relatedCacheKeys = cacheKeyUtils.getRelatedCacheKeys(cacheKey);

        Assertions.assertThat(relatedCacheKeys).containsExactlyInAnyOrderElementsOf(List.of(
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|3|2|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|4|2|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|5|2|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|6|2|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|7|2|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|3|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|4|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|5|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|6|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|7|0|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|1|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|2|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|3|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|4|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|5|0|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|0|1|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|0|2|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|0|3|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|0|4|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|2|0|5|0|<discCardHash>|<abParamterHash>"

        ));
    }

    @Test
    void forTotal9PassengersTheRelatedCacheKeyWillBeEmpty() {
        String cacheKey = "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|3|1|2|1|<discCardHash>|<abParamterHash>";
        List<String> relatedCacheKeys = cacheKeyUtils.getRelatedCacheKeys(cacheKey);

        Assertions.assertThat(relatedCacheKeys).isEmpty();
    }

    @Test
    void forTotal8PassengersWithNoInfant() {
        String cacheKey = "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|3|1|2|0|<discCardHash>|<abParamterHash>";
        List<String> relatedCacheKeys = cacheKeyUtils.getRelatedCacheKeys(cacheKey);

        Assertions.assertThat(relatedCacheKeys).containsExactlyInAnyOrderElementsOf(List.of(
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|3|3|1|2|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|4|1|2|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|3|2|2|0|<discCardHash>|<abParamterHash>",
                "deutscheBahn|12345|67890|2020-12-01|2020-12-02|2|3|1|3|0|<discCardHash>|<abParamterHash>"
        ));
    }
}
