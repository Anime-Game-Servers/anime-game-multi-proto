# Modules

| Module                  | Description                                                                                                                       |
|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| codeGenerator/processor | This module handles generating the actual models for parsing the proto data structure and working with them                       |
| gi                      | Protocol definitions for a certain Anime game with with initials GI. It will contains all the known models for all versions of it |


# Code Generator/Processor

## Building

jar:
```shell
gradlew :processor:jvmJar
```

mavenLocal:
```shell
gradlew :processor:publishToMavenLocal
```
debugging in intellij:
* Make sure there os no kotlin compile daemon running
* Add these vm options to a task(like `kspCommonMainKotlinMetadata`) 
```
-Dkotlin.daemon.jvm.options="-Xdebug,-Xrunjdwp:transport=dt_socket\,address=8765\,server=y\,suspend=n"
```
* Run the task 
* Attach to the `kotlinCompileDaemon` process (Run->Attach to process)
* Use debug features like break points

# All Game modules
All Game Modules share the same general basics, since they just define models for the game and use the processor module to generate the actual parsing

## Annotations
### Model Type Annotations
Every model that should be processed needs one of those annotations to define what type of Proto it is.
The available types are: ProtoEnum, ProtoModel, ProtoCommand
#### @ProtoEnum
This is used to mark an enum type proto, that can be used in of other ProtoModels
#### @ProtoModel
This is used to mark a general message type proto, that can be used in other ProtoModels
#### @ProtoCommand
This is a special type of message type proto/ProtoModel, that's send by either the client or server to communicate. These are identified by a cmdId during communication. This cmdId can be different depending on the Version of the game.
ProtoCommands are normally standalone, and not used in any other model.

### Field Annotations
#### @OneOf 
This is used to define the OneOf feature from protos.
The available types are defined via an @OneOfEntry annotations array.

#### @AltName
This can be used to define alternative names used in the protocol definitions for a field. This can for example happen when typos get fixed, or the community gives a field different names. 

### Annotations for documentation
#### @AddedIn/@RemovedIn 
These Annotations are used to define in which version a proto or a field in a proto got added to or removed from the protocol definition. 
Removed in is here much rarer then added in, since normally fields are just deprecated and not removed.

## Adding Models
TODO

# GI
## Building
jar:
```shell
gradlew :gi:jvmJar
```

mavenLocal:
```shell
gradlew :gi:publishJvmPublicationToMavenLocal
```