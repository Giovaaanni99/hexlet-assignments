package exercise;

import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filePath;
    private Map<String, String> storage;
    private Map<String, String> initialData;

    public FileKV(String filePath, Map<String, String> storage) {
        this.filePath = filePath;
        this.storage = storage;
        Utils.writeFile(filePath, Utils.serialize(initialData));
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
        Utils.writeFile(filePath, Utils.serialize(storage)); // обновляем файл
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
        Utils.writeFile(filePath, Utils.serialize(storage)); // обновляем файл
    }

    @Override
    public String get(String key, String defaultValue) {
        if (!storage.containsKey(key)) {
            return defaultValue;
        }
        return storage.get(key);
    }

    @Override
    public Map<String, String> toMap() {
        return storage;
    }

    private void loadData() {
        this.storage = Utils.deserialize(Utils.readFile(filePath));
    }
}
// END
