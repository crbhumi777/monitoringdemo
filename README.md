# monitoring-demo
Monitoring spring boot application using grafana and prometheus

- Spring boot actuators : helps to monitor and manage spring boot app. With the help of actuators endpoints, we can expose our application metrics.
- Prometheus : monitoring system, that will use data scraper to collect data via http endpoints by polling at regular interval and store it in a time series database
- Grafana : collects metrics from various sources and helps to query, visualise, alert on and understand our metrics

STEPS:
1. Add actuators and prometheus dependency
2. Expose the endpoints to collect metrics by configuring in properties file
3. Build docker image
4. Install Prometheus and grafana
5. configure prometheus as data source and prometheus in grafana to create dashboards 
