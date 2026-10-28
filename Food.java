import java.util.Random;

public enum Food {
    // NIGIRI
    NIGIRI_SALMONE,
    NIGIRI_TONNO,
    NIGIRI_GAMBERO,

    // HOSOMAKI
    HOSOMAKI_SALMONE,
    HOSOMAKI_AVOCADO,
    HOSOMAKI_TONNO,

    // URAMAKI
    URAMAKI_CALIFORNIA,
    URAMAKI_PHILADELPHIA,
    URAMAKI_TIGER,
    URAMAKI_EBITEN,

    // GUNKAN
    GUNKAN_SPICY_SALMON,
    GUNKAN_IKURA,

    // SASHIMI
    SASHIMI_SALMONE,
    SASHIMI_TONNO,
    SASHIMI_MISTO,

    // SPECIAL
    STOKATSOU,
    KIT_KATESENKURA,
    BOKU_CHITCHO,
    NIGURA,
    lEKTSA_KULOU;

    public Food randomFood(){
        Food[] foods = values();
        Random rand = new Random();
        return foods[rand.nextInt(foods.length)];
    }
}
