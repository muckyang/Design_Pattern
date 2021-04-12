package Patterns.StrucuralPattern.Observer.Default;

public class Button {

    public void onClick() {
        onClickListener.buttonClick(this);
    }

    public interface OnClickListener {
        public void buttonClick(Button button);
    }

    private OnClickListener onClickListener;

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

}

