# monorepo-sample-project
Sample project with stack React JS - Typescript - Kotlin Springboot

## Build status

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/sample-user/sample-project/tree/master.svg?style=svg&circle-token=sample-token)](https://dl.circleci.com/status-badge/redirect/gh/sample-user/sample-project/tree/master)

## Sonar quality gate status
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=sample-project&metric=alert_status&token=sample-token)](https://sonarcloud.io/summary/new_code?id=sample-project)

## Apps

### Backend

Main backend gradle project is [backend](./backend), composed of the following subprojects

- [core-api](./backend/core-api) Spring Reactive webflux I/O API Server to handle API calls from the [main-frontend](./frontend/main). Run locally by execute command `gradlew backend:core-api:bootRun`.
- [auth-service](./backend/auth-service) To handle authorization and authentication for [core-api](./backend/core-api)

### Frontend

- [main-frontend](./frontend/main-app/README.md) Main frontend web app. Run locally by execute command `gradlew frontend:main-app:runDev`.
