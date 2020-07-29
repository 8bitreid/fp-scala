CREATE TABLE users
(
    user_id uuid PRIMARY KEY
)

CREATE TABLE bills
(
    bill_id uuid PRIMARY KEY,
    user_id uuid NOT NULL,
    name TEXT NOT NULL,
    ammount NUMERIC NOT NULL,
    due_date TIMESTAMP,
    paid BOOLEAN,
    UNIQUE (name),
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);