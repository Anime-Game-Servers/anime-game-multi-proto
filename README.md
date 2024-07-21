# anime-game-multi-proto (WIP)
project to allow supporting multiple versions easier

TODOs:
* add more definitons for the protos
* improve code
* add actual protos for as many versions as possible
* apply annotations to created models
* add info about building and adding things to the README
* add info about using multiproto

# Getting Started
Add the [ags maven repository](https://mvn.animegameservers.org/#/releases) to your build script, e.g. for gradle kt: 
```kt
maven {
    name = "agsmvnReleases"
    url = uri("https://mvn.animegameservers.org/releases")
}
```

Then add the game module you want to use to your dependencies, e.g. for the gi module:
```kt
implementation("org.anime_game_servers.multi_proto:gi-jvm:0.2.32")
```

Licensing
=====

This software library is licensed und the terms of the MIT license, with the exemptions noted below.

You can find a copy of the license in the [LICENSE file](LICENSE).

Exemptions:
* miHoYo and its subsidiaries are exempt from the MIT licensing and may instead license any source code authored for the AnimeGameServer projects under the Zero-Clause BSD license.
