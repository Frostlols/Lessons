public class user2 {
    public int Id;
    public static void main(String[] args) {
        user2 s= new user2();
        s.Id=10;
        user2 s2= new user2();
        s2.Id=10;
        s.name = "Kukla";
        s.hight= 187f;
            System.out.println(s.toString());
        if(s.equals(s2)){
            System.out.println("правда");
        }else {
            System.out.println(" не правда");
        }

        s.toString();
        System.out.println(s.toString());
        s2.toString();
        System.out.println(s2.toString());

        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

    }
    @Override//переписывает свойстов equals
        public boolean equals(Object obj) {
            user2 user3=(user2)obj;
            return this.Id==user3.Id;
        }
            @Override
            public int hashCode(){

                return 0;
            }
                @Override
                 public String toString() {
                     return String.format("[%d] name: %s hight: %.1f", Id, name, hight); //меняет строку

    }
                    public String name;
                     public float hight;
}

