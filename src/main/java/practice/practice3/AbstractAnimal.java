package practice.practice3;

public abstract class AbstractAnimal {

    protected  String type = "kangaroo";

    public String getType(){
        return this.type;
    }



    class Cat extends AbstractAnimal{

        public Cat(){
            super.type = "Cat";
        }
    }

    class  SiamenseCat extends Cat{
        public SiamenseCat(){
            this.type = "scat";
        }

        public String getType(){
            return super.getType();
        }

    }


}
