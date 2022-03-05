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
