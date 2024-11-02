/**
 * Класс Main для запуска программы.
 * Создает массив одежды и передает его в методы для одевания мужчин и женщин.
 *<a href="https://app.weje.io/b/-O6aFLjUdiOhesHcqiYA" style="color: black; font-size: 100px;">мои лабы</a>
 * @author <b>Alexey Uhanov</b>
 */
public class Main {
    public static void main(String[] args) {
    }
}

/**
 * Перечисление размера одежды с описаниями и соответствующим евроразмером.
 */
enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34), S(36), M(38), L(40);

    private int euroSize;

    /**
     * Конструктор для установки евроразмера.
     *
     * @param euroSize евроразмер
     */
    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    /**
     * Возвращает описание размера одежды.
     *
     * @return описание размера
     */
    public String getDescription() {
        return "Взрослый размер";
    }

    /**
     * Возвращает евроразмер.
     *
     * @return евроразмер
     */
    public int getEuroSize() {
        return euroSize;
    }
}

/**
 * Интерфейс для мужской одежды.
 */
interface ManCloth {
    /**
     * Метод, который описывает, как носить мужскую одежду.
     */
    void wearMan();
}
