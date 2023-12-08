package datamahasiswa;

public class MahasiswaBaru {
    private final String IDpengguna;
    private final String password;

    public MahasiswaBaru(String IDpengguna, String password) {
        this.IDpengguna = IDpengguna;
        this.password = password;
    }

    public String getIDpengguna() {
        return IDpengguna;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ID Pengguna: " + IDpengguna + ", Password: " + password;
    }
}

