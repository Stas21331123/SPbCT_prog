package PR9_10.Task2;

import java.applet.*;
import java.awt.*;

public class Multi extends Applet implements Runnable {
    private Thread m_Multi = null;
    boolean going = true;
    private boolean m_fStandAlone = false;
    public static void main(String args[]) {
        MultiFrame frame = new MultiFrame("Title");
        frame.show(); frame.hide();
        frame.resize(frame.insets().left + frame.insets().right + 320, frame.insets().top + frame.insets().bottom + 240);
        Multi applet_Combi = new Multi();
        frame.add("Center", applet_Combi);
        applet_Combi.m_fStandAlone = true;
        applet_Combi.init();
        applet_Combi.start();
        frame.show();
    }

    public Multi() throws HeadlessException {
        this.m_Multi = m_Multi;
        this.going = going;
        this.m_fStandAlone = m_fStandAlone;
    }

    public String getAppletInfo() {
        return "Name: CombiApplet\r\n" + "";
    }
    //--------------------------------------------------------------------------
    public void init(){
        resize(320, 240);
    }
    //-------------------------------------------------------------------------
    public void destroy() {
        destroy();
    }
    //--------------------------------------------------------------------------
    public void paint(Graphics g)
    {	// Сделать: Добавьте сюда код перерисовки окна апплета
        g.drawString("Running: " + Math.random(), 10, 20);
    }
    //--------------------------------------------------------------------------
    public void start() {	// если поток еще не создан, апплет создает
        // новый поток как объект класса Thread
        if (m_Multi == null)
        {	m_Multi = new Thread(this); // создание потока
            m_Multi.start(); // запуск потока
        }
    }
    //--------------------------------------------------------------------------
    public void stop()
    {	// когда пользователь покидает страницу,
        // метод stop() класса Thread останавливает поток
        if (m_Multi != null) // если поток был создан
        {	going = false; //остановка потока
            m_Multi = null; // сброс ссылки на поток
        }
    }
    //--------------------------------------------------------------------------
    public void run()
    {	// выполняем обновление окна в бесконечном цикле
        while (true) {	try {
            repaint();
            // Сделать выполнение задержки 0.5 сек.
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            // Сделать: Добавьте сюда код, который должен здесь работать при генерации исключения если при выполнении задержки произошл исключение, останавливаем работу апплета
            System.out.println("Error");
            stop();
            }
        }
    }
}

