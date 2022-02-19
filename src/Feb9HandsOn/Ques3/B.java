package  Feb9HandsOn.Ques3;

class B extends Marks {
    int marks1, marks2, marks3, marks4;

    B(int m1, int m2, int m3, int m4) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        marks4 = m4;
    }

    public float getPercentage() {
        float total = ((marks1 + marks2 + marks3 + marks4) / (float) 400) * 100;
        return total;
    }
}
