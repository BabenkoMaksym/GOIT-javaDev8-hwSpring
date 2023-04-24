CREATE SCHEMA IF NOT EXISTS spring_hw;

CREATE TABLE IF NOT EXISTS spring_hw.note (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT
);
