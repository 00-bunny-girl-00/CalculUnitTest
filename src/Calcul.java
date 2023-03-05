public class Calcul {
    float num1;
    float num2;

    public Calcul(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float sum(){
        float result = num1 + num2;
        return result;
    }

    public float subtraction(){
        float result = num1 - num2;
        return result;
    }

    public float multiplication(){
        float result = num1 * num2;
        return result;
    }

    public float division(){
        if(num2 == 0){
            throw new ArithmeticException("На ноль делить нельзя");
        }
        else{
            float result = num1 / num2;
            return result;
        }
    }
}
