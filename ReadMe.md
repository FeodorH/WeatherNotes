Main idea: 
The app performs the function of getting weather from the standard Web API(OpenWeatherMap), as well as saving messages with the ability to insert the current weather.
The database is based on SQLLite. 
Jetpack Compoce is used to display the UI.

Architecture tree:
```mermaid
graph TD
    M[Modules] --> app
    M --> core
    M --> features
    M --> d[data]
    
    core --> common
    core --> db[database]
    core --> net[network]
    core --> domain
    
    features --> w[weather]
    features --> n[notes]
    features --> auth
    
    d --> repos[repository]
```

Module dependencies:
```mermaid
graph TD
    a[app] --> auth[auth]
    a --> n[notes]
    a --> w[weather]
    
    w --> d[domain]
    
    d --> db[database]
    d --> net[network]
    d --> repos[repository]
    d --> c[common]
```
