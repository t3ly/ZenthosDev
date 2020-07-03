package net;

public enum RecvPacketOpcode {
    ACCEPT_FAMILY(0x96),
    ADD_FAMILY(0x93),
    ADMIN_COMMAND(0x80),
    ADMIN_LOG(0x81),
    ADMIN_MESSENGER(0xF5),
    AFTER_LOGIN(0x09),
    ALLIANCE_DENIED(0x90),
    ALLIANCE_OPERATION(0x8F),
    ARAN_COMBO(0xA3),
    AUTO_AGGRO(0xBD),
    AUTO_DISTRIBUTE_AP(0x58),
    BBS_OPERATION(0x9B),
    BEHOLDER(0xB2),
    BUDDYLIST_MODIFY(0x82),
    BUY_CS_ITEM(0xE5),
    CANCEL_BUFF(0x5C),
    CANCEL_CHAIR(0x2A),
    CANCEL_DEBUFF(0x63),
    CANCEL_ITEM_EFFECT(0x49),
    CHANGE_CHANNEL(0x27),
    CHANGE_KEYMAP(0x87),
    CHANGE_MAP(0x26),
    CHANGE_MAP_SPECIAL(0x64),
    CHARLIST_REQUEST(0x05),
    CHAR_INFO_REQUEST(0x61),
    CHAR_SELECT(0x1E),
    CHAR_SELECT_WITH_PIC(0x1E),
    CHECK_CHAR_NAME(0x15),
    CLIENT_ERROR(0x1B),
    CLIENT_START(0x19),
    CLOSE_CHALKBOARD(0x32),
    CLOSE_ITEMUI(0xEC),
    CLOSE_RANGE_ATTACK(0x2C),
    COUPON_CODE(0xE6),
    CREATE_CHAR(0x16),
    DAMAGE_REACTOR(0xCD),
    DAMAGE_SUMMON(0xB1),
    DELETE_CHAR(0x17),
    DENY_GUILD_REQUEST(0x7F),
    DENY_PARTY_REQUEST(0x7D),
    DISTRIBUTE_AP(0x57),
    DISTRIBUTE_SP(0x5A),
    DUEY_ACTION(0x41),
    ENERGY_ORB_ATTACK(0x2F),
    ENTER_CASH_SHOP(0x28),
    ENTER_MTS(0x9C),
    ENTER_MYSTIC_DOOR(0x83),
    ERROR(0x1A),
    FACE_EXPRESSION(0x33),
    GENERAL_CHAT(0x31),
    GIVE_FAME(0x5F),
    GUILD_OPERATION(0x7E),
    HEAL_OVER_TIME(0x59),
    HIRED_MERCHANT_REQUEST(0x3F),
    ITEM_MOVE(0x47),
    ITEM_PICKUP(0xCA),
    ITEM_SORT(0x45),
    ITEM_SORT2(0x46),
    LOGIN_PASSWORD(0x01),
    MAGIC_ATTACK(0x2E),
    MAKER_SKILL(0x72),
    MESO_DROP(0x5E),
    MESSENGER(0x7A),
    MOB_DAMAGE_MOB(0xC2),
    MOB_DAMAGE_MOB_FRIENDLY(0xC0),
    MONSTER_BOMB(0xC1),
    MONSTER_BOOK_COVER(0x39),
    MONSTER_CARNIVAL(0xDA),
    MOVE_LIFE(0xBC),
    MOVE_PET(0xA7),
    MOVE_PLAYER(0x29),
    MOVE_SUMMON(0xAF),
    MTS_OP(0xFB),
    NOTE_ACTION(0x84),
    NPC_ACTION(0xC5),
    NPC_SHOP(0x3D),
    NPC_TALK(0x3A),
    NPC_TALK_MORE(0x3C),
    OPEN_FAMILY(0x92),
    OPEN_ITEMUI(0xEB),
    OPEN_TREASURE(0x70),
    PARTYCHAT(0x77),
    PARTY_OPERATION(0x7C),
    PARTY_SEARCH_REGISTER(0xDC),
    PARTY_SEARCH_START(0xDE),
    PET_AUTO_POT(0xAB),
    PET_CHAT(0xA8),
    PET_COMMAND(0xA9),
    PET_EXCLUDE_ITEMS(0xAC),
    PET_FOOD(0x4C),
    PET_LOOT(0xAA),
    PET_TALK(0x9D),
    PICK_ALL_CHAR(0x0E),
    PLAYER_DC(0x0C),
    PLAYER_INTERACTION(0x7B),
    PLAYER_LOGGEDIN(0x14),
    PLAYER_UPDATE(0xDF),
    POISON_BOMB(0x6D),
    PONG(0x18),
    PROMPT_PIC_ALL_CHAR(0x20),
    QUEST_ACTION(0x6B),
    QUICK_SLOT_CHANGE(0xB7),
    RANGED_ATTACK(0x2D),
    REGISTER_PIC(0x1D),
    REGISTER_PIC_ALL_CHAR(0x1F),
    REGISTER_PIN(0x0A),
    RELOG(0x1C),
    REMOTE_SHOP(0x3B),
    REPORT(0x6A),
    RING_ACTION(0x89),
    SCRIPTED_ITEM(0x4E),
    SEE_ALL_CHAR(0x0F),
    SERVERLIST_REQUEST(0x0B),
    SERVERLIST_REREQUEST(0x04),
    SERVERSTATUS_REQUEST(0x06),
    SET_GENDER(0x08),
    SKILL_EFFECT(0x5D),
    SKILL_MACRO(0x6E),
    SOMETHING(0x6F),
    SPAWN_PET(0x62),
    SPECIAL_MOVE(0x5B),
    SPOUSE_CHAT(0x79),
    STORAGE(0x3E),
    SUMMON_ATTACK(0xB0),
    TAKE_DAMAGE(0x30),
    TOUCHING_CS(0xEC),
    TOUCHING_REACTOR(0xCE),
    TROCK_ADD_MAP(0x66),
    UPDATE_CHAR_2(0xCF),
    USE_CASH_ITEM(0x4F),
    USE_CATCH_ITEM(0x51),
    USE_CHAIR(0x2B),
    USE_DEATHITEM(0x36),
    USE_DOOR(0x85),
    USE_FAMILY(0x97),
    USE_HAMMER(0x104),
    USE_INNER_PORTAL(0x65),
    USE_ITEM(0x48),
    USE_ITEMEFFECT(0x34),
    USE_ITEMUI(0xED),
    USE_MAPLELIFE(0xFE),
    USE_MOUNT_FOOD(0x4D),
    USE_REMOTE(0x74),
    USE_RETURN_SCROLL(0x55),
    USE_SKILL_BOOK(0x52),
    USE_SOLOMON_ITEM(0x9E),
    USE_SUMMON_BAG(0x4B),
    USE_TELEPORT_ROCK(0x54),
    USE_UPGRADE_SCROLL(0x56),
    VIEW_ALL_CHAR(0x0D),
    WHISPER(0x78);
    private final int code;

    private RecvPacketOpcode(int code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }
}