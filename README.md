# Java JPA


### How to start your postgres server on MacOS

1. Install postgres using brew.
```aidl
$ brew install postgres
```
2. Start your postgres server.
```aidl
$ psql postgres
```
3. Grant access after created database.
```aidl
GRANT ALL PRIVILEGES ON DATABASE "<database name>" TO <usr>;
```

### Run the build
1. Maven clean
2. Maven install
```aidl
cd target
java -jar demo-0.0.1-SNAPSHOT.jar --server.port=<port>
```