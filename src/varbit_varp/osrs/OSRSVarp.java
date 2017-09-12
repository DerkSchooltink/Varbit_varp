package varbit_varp.osrs;

public enum OSRSVarp {

    BLAST_FURNACE_COOLING_STATE(543),
    BLAST_FURNACE_STORED_ORE(547),
    BLAST_FURNACE_COFFER_COINS(795),

    STAMINA_POTION_ACTIVE(628),

    QUEST_POINTS(101),

    SPECIAL_ATTACK_ENABLED(301),
    SPECIAL_ATTACK_ENERGY(300),

    PLAYER_POISONED_STATE(83),
    PLAYER_VENOM_STATE(12),

    AUTO_RETALIATING(172),

    RUN_ENABLED(173);

    private final int varp;

    OSRSVarp(int varp) {
        this.varp = varp;
    }
}
