package rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    CONFERENCE(15);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }
    public int getValue() {
        return this.capacity;
    }
}
