```mermaid
        graph TD
            M[Modules] --> app[app], core[core], features[features], d[data];
            core --> common[common], db[database], net[network], domain[domain];
            features --> w[weather], n[notes], auth[auth];
            d --> repos[repository];
        ```
