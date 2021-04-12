package Patterns.StrucuralPattern.Observer.Default;

import static Patterns.StrucuralPattern.Observer.Default.Button.*;

public class Application {
    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void buttonClick(Button button) {
                System.out.println(button.hashCode() + " Click!");
            }
        });
        button.onClick();
    }
}