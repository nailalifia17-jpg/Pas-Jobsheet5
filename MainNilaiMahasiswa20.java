public class MainNilaiMahasiswa20 {
    public static void main(String[] args) {
        
        mahasiswa20 data[] = {
            new mahasiswa20("Ahmad","220101001",2022,78,82),
            new mahasiswa20("Budi","220101002",2022,85,88),
            new mahasiswa20("Cindy","220101003",2021,90,87),
            new mahasiswa20("Dian","220101004",2021,76,79),
            new mahasiswa20("Eko","220101005",2023,92,95),
            new mahasiswa20("Fajar","220101006",2020,88,85),
            new mahasiswa20("Gina","220101007",2023,80,83),
            new mahasiswa20("Hadi","220101008",2020,82,84)
        };
        prosesNilai20 p = new prosesNilai20();

        int maxUTS = p.maxUTS(data, 0, data.length-1);
        int minUTS = p.minUTS(data, 0, data.length-1);
        double rataUAS = p.rataUAS(data);

        System.out.println("Nilai UTS Tertinggi (Divide and Conquer) : " + maxUTS);
        System.out.println("Nilai UTS Terendah (Divide and Conquer) : " + minUTS);
        System.out.println("Rata-rata Nilai UAS (Brute Force) : " + rataUAS);
    }
}
