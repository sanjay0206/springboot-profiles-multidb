# shellcheck disable=SC2164

cd /g/Softwares/PostgresSQL16/bin
pg_ctl.exe start -D /g/Softwares/PostgresSQL16/data

psql -h localhost -p 5432 -U postgres -d flight_db_uat