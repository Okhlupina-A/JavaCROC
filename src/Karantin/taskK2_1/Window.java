package taskK2_1;

public class Window {
    int countOfWindows = 5;
    boolean status = false; //false - занято, true- свободно
    int numberOfWindow;

    public Window(boolean status, int numberOfWindow) {
        this.status = status;
        if(numberOfWindow<=countOfWindows) {
            this.numberOfWindow = numberOfWindow;
        }
    }

    static Window window1 = new Window(true, 1);
    static Window window2 = new Window(true, 2);
    static Window window3 = new Window(true, 3);
    static Window window4 = new Window(true, 4);
    static Window window5 = new Window(true, 5);
    public static Window[] allWindows = new Window[] {window1, window2, window3, window4, window5};

    public void setStatusOfWindow(boolean status) {
        this.status = !this.status; // окно свободно
    }

}
