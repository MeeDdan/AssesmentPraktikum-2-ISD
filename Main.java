public class Main {

    public static void main(String[] args) {
        MinHeap q = new MinHeap();
                              //=======================\\
                             //         SOAL : B        \\
         //=================// Munculkan seluruh langkah,\\=====================\\
        // jika langkah-langkah yang semakin menjauh ditampilkan terlebih dahulu \\
       //=========================================================================\\
                q.add(new Pojo(1, "Eat"));
                q.add(new Pojo(2, "Pour sauce over patty"));
                q.add(new Pojo(3, "Add Some Pickles"));
                q.add(new Pojo(3, "Serve Patty"));
                q.add(new Pojo(3, "Add Tartar Sauce"));
                q.add(new Pojo(3, "Serve Bread"));
                q.add(new Pojo(4, "Set Plate"));
                q.add(new Pojo(4, "Add Craby Patty"));
                q.add(new Pojo(5, "Bake Bread"));
                q.add(new Pojo(5, "Preheat Pan"));
                q.add(new Pojo(6, "Preheat Oven"));

                                        q.remove();
    }
}