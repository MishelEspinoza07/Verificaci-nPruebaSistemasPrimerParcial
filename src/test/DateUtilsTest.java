package examen.pregunta1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {

    // Probar con una fecha específica: 2024-03-15 (viernes)
    @Test
    public void testDateutilsToday2024() {
        DateUtils dateUtils = new DateUtils();
        String expectedResult = "FRIDAY";
        String actualResult = dateUtils.getDayOfWeek("2024-03-15");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Probar con una fecha del año anterior: 2023-05-20 (sábado)
    @Test
    public void testDateutils2023() {
        DateUtils dateUtils = new DateUtils();
        String expectedResult = "SATURDAY";
        String actualResult = dateUtils.getDayOfWeek("2023-05-20");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Probar con una fecha en el futuro: 2028-11-25 (sábado)
    @Test
    public void testDateutils2028() {
        DateUtils dateUtils = new DateUtils();
        String expectedResult = "SATURDAY";
        String actualResult = dateUtils.getDayOfWeek("2028-11-25");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Probar con una fecha incorrecta (cambia solo el mes y el día): 2033-09-17 (sábado)
    @Test
    public void testDateutils2033() {
        DateUtils dateUtils = new DateUtils();
        String expectedResult = "SATURDAY"; // 2033-09-17 es sábado
        String actualResult = dateUtils.getDayOfWeek("2033-09-17");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Probar una fecha con un día inválido: 2024-03-00 (no existe)
    @Test
    public void day0() {
        DateUtils dateUtils = new DateUtils();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            dateUtils.getDayOfWeek("2024-03-00");
        });
    }
}
