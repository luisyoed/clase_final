CREATE SOURCE CONNECTOR `jdbc-connector-ksql` WITH (
    'connector.class' = 'io.confluent.connect.jdbc.JdbcSourceConnector',
    'tasks.max' = '2',
    'connection.url' = 'jdbc:postgresql://127.0.0.1:5432/root?user=root&password=secret',
    'table.whitelist' = 'studentsnew',
    'mode' = 'incrementing',
    'incrementing.column.name' = 'studenid',
    'timestamp.column.name' = 'updated_at',
    'topic.prefix' = 'topic_ksql_',
    'topic.creation.default.replication.factor' =  1,
    'topic.creation.default.partitions' =  4
);