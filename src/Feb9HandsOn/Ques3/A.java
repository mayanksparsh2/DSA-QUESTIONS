package  Feb9HandsOn.Ques3;

class A extends Marks {
    int marks1, marks2, marks3;

    A(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    public float getPercentage() {
        float total = ((marks1 + marks2 + marks3) / (float) 300) * 100;
        return total;
    }
}
