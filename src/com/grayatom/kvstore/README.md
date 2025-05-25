# Ask / Problem Statement
Design a KVStore which allows
- reading a value given the key from the store
- inserting a new key-value to the store
- updating an existing value in the store
- deleting a specific entry from the store
- update your current implementation to
support concurrent transactions with optimistic concurrency control

## How to Run
```bash
javac -d out src/com/grayatom/kvstore/*.java
java -cp out com.grayatom.kvstore.KeyValueStore