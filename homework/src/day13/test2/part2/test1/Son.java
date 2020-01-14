package day13.test2.part2.test1;

public class Son extends Father {
    /*@Override // a 报错
    public void eat() throws TonguePainException {

    }*/

    /*@Override // b 报错
    public void eat() throws PainException {

    }*/

    /*@Override // c 不报错
    public void eat() throws ToothPainException {

    }*/

    /*@Override // d 不报错
    public void eat() throws FrontToothPainException {

    }*/

    /*@Override // e 不报错
    public void eat() throws BigToothPainException, FrontToothPainException {

    }*/

    /*@Override // f 报错
    public void drink() throws BigToothPainException {

    }*/

    @Override // g
    public void drink() /*throws TonguePainException*/ {
        System.out.println("喝到了100度的水");
        // throw new TonguePainException("子类舌头疼"); // 报错

        // 不报错
        try {
            throw new TonguePainException("子类舌头疼");
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}
