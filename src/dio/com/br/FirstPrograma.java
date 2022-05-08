package dio.com.br;

import dio.com.br.model.Cat;

public class FirstPrograma {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        Magazines magazines1 = new Magazines("O problema dos 3 corpos", 300);
        System.out.println(magazines1);

        /*int c = 5;
        int d = 3;
        System.out.println("Hello World! " + (5 + 3));*/
    }
}

class Magazines {
    private String name;
    private Integer npages;

    public Magazines(String s, int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNpages() {
        return npages;
    }

    public void setNpages(Integer npages) {
        this.npages = npages;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "name='" + name + '\'' +
                ", npages=" + npages +
                '}';
    }
}



