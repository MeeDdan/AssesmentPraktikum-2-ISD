public class Main {

    public static void main(String[] args) {
        MinHeap q = new MinHeap();
        
                            // Munculkan seluruh langkah,\\
        // jika langkah-langkah yang berdekatan ditampilkan terlebih dahulu \\

        q.add(new Pojo(1, "Preheat Oven"));
        q.add(new Pojo(2, "Preheat Pan"));
        q.add(new Pojo(2, "Bake Bread"));
        q.add(new Pojo(3, "Add Craby Patty"));
        q.add(new Pojo(3, "Set Plate"));
        q.add(new Pojo(4, "Serve Bread"));
        q.add(new Pojo(4, "Add Tartar Sauce"));
        q.add(new Pojo(4, "Serve Patty"));
        q.add(new Pojo(4, "Add Some Pickles"));
        q.add(new Pojo(5, "Pour sauce over patty"));
        q.add(new Pojo(6, "Eat"));

        q.remove();
    }
}