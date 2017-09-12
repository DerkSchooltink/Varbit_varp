package varbit_varp.osrs;

public enum OSRSVarbit {

    HOSIDIUS_FAVOR(4895),
    SHAYZIEN_FAVOR(4894),
    ARCEUS_FAVOR(4896),
    PISCARILLIUS_FAVOR(4899),

    SMALL_POUCH(603),
    MEDIUM_POUCH(604),
    LARGE_POUCH(605),
    GIANT_POUCH(606),

    SHIFT_DROPPING_ENABLED(5542),

    OVERLOAD_TIME_REMAINING(3955),
    STAMINA_POTION_ACTIVE(25),

    FAIRY_RING_LEFT_DIAL(3985),
    FAIRY_RING_MIDDLE_DIAL(3986),
    FAIRY_RING_RIGHT_DIAL(3987);

    private final int varbit;

    OSRSVarbit(int varbit) {
        this.varbit = varbit;
    }

    public int getVarbit() {
        return varbit;
    }
}
