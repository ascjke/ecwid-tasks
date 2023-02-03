package ru.borisov.deepclone;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyUtils<T> {

    public static <T> T deepCopy(T object) throws InstantiationException, IllegalAccessException {
        Class<?> someClass = object.getClass();
        T objectCopy = (T) object.getClass().newInstance();

        List<Field> fields = new ArrayList<>(Arrays.asList(someClass.getDeclaredFields()));
        fields.forEach(field -> {
            field.setAccessible(true);
            try {
                field.set(objectCopy, field.get(object));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });

        return objectCopy;
    }
}
