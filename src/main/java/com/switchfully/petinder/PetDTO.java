package com.switchfully.petinder;

public class PetDTO {
    private final int id;
    private final String name;
    private final Kind kind;
    private final String profileString;

    public PetDTO(int id, String name, Kind kind, String profileString) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.profileString = profileString;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }

    public String getProfileString() {
        return profileString;
    }
}
