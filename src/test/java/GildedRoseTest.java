import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void testNormalItemBeforeSellDate() {
        GildedRose item = new GildedRose("normal", 10, 5);
        item.tick();
        
        assertEquals(9, item.quality);
        assertEquals(4, item.daysRemaining);
    }

    @Test
    public void testNormalItemOnSellDate() {
    }

    @Test
    public void testNormalItemAfterSellDate() {
    }

    @Test
    public void testNormalOfZeroQuality() {
    }

    @Test
    public void testBrieBeforeSellDate() {
    }

    @Test
    public void testBrieBeforeSellDateWithMaxQuality() {
    }

    @Test
    public void testBrieOnSellDate() {
    }

    @Test
    public void testBrieOnSellDateNearMaxQuality() {
    }

    @Test
    public void testBrieOnSellDateWithMaxQuality() {
    }

    @Test
    public void testBrieAfterSellDate() {
    }

    @Test
    public void testBrieAfterSellDateWithMaxQuality() {
    }

    @Test
    public void testSulfurasBeforeSellDate() {
    }

    @Test
    public void testSulfurasOnSellDate() {
    }

    @Test
    public void testSulfurasAfterSellDate() {
    }

    @Test
    public void testBackStagePassLongBeforeSellDate() {
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateUpperBound() {
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateUpperBoundAtMaxQuality() {
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateLowerBound() {
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateLowerBoundAtMaxQuality() {
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateUpperBound() {
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateUpperBoundAtMaxQuality() {
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateLowerBound() {
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateLowerBoundAtMaxQuality() {
    }

    @Test
    public void testBackStagePassOnSellDate() {
    }

    @Test
    public void testBackStagePassAfterSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemBeforeSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemAtZeroQuality() {
    }

    @Test
    @Ignore
    public void testConjuredItemOnSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemOnSellDateAtZeroQuality() {
    }

    @Test
    @Ignore
    public void testConjuredItemAfterSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemAfterSellDateAtZeroQuality() {
    }

}
