package LAB_PBO_2024.Praktikum.Praktikum_06;

class Bulldog extends Dog {
    Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Bulldog bergerak ke kanan menjadi posisi" + this.position);
    }

    @Override
    public void Describe() {
        System.out.println("tubuh lebar, besar, moncong pesek, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipat");
    }
}
