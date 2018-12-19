package CS434;

import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

enum ObserverType {
    MEMBER, TRAINER, PLAN;
}

public class Observer {
    private static FileAlterationObserver[] ourInstance = {new FileAlterationObserver(new File("members.ini")),
            new FileAlterationObserver(new File("trainers.ini")),
            new FileAlterationObserver(new File("plan.ini"))};

    private Observer() {
    }

    public static FileAlterationObserver getInstance(int index) {
        return ourInstance[index];
    }
}