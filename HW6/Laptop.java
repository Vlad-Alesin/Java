
public class Laptop {
    
    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String colour;
    private double diagonal;
    private String proc;

    public Laptop (String name, int ram, int storageCap, String os, String colour, double diagonal, String proc){
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.colour = colour;
        this.diagonal = diagonal;
        this.proc = proc;
    }

    @Override
    public String toString() {
        return String.format("Название ноутбука: %s \n объем оперативной памяти %d Гб \n объем накопителя %d Гб \n ОС %s \n Цвет %s \n Диагональ %.1f \n Процессор %s \n", 
                    this.name, this.ram, this.storageCap, this.os, this.colour, this.diagonal, this.proc);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            return this.name == ((Laptop) obj).name && this.ram == ((Laptop) obj).ram 
                                && this.storageCap == ((Laptop) obj).storageCap && this.os == ((Laptop) obj).os 
                                && this.colour == ((Laptop) obj).colour && this.diagonal == ((Laptop) obj).diagonal 
                                && this.proc == ((Laptop) obj).proc;
        }
        return false;

    }

    public int getRam(){
        return this.ram;
    }

    public int getStorageCap(){
        return this.storageCap;
    }

    public String getOS(){
        return this.os;
    }

    public double getDiagonal(){
        return this.diagonal;
    } 

    public String getProc(){
        return this.proc;
    }
}