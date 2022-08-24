![ClashAPI logo](/src/main/resources/logo.png)

<p align="center">
  <a href="https://github.com/Lycoon/clash-api/actions/workflows/check-ci.yml">
    <img alt="Check CI status" src="https://github.com/Lycoon/clash-api/actions/workflows/check-ci.yml/badge.svg?branch=dev">
  </a>
  <img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/Lycoon/clash-api">
</p>

ClashAPI is a very simple yet very complete Kotlin wrapper for the Clash of Clans mobile game API. It allows developers to easily do requests to the game API without bothering about JSON and HTTP handling.

## How does it work?
I analyzed JSON responses from the Clash of Clans API to recreate the models as Java structures so you don't have to deal with deserialization and data categorization each time. You can therefore simply access game data through classes and methods, all documented!


## How to use it?
```java
// 1. Create an instance of ClashAPI by providing your Clash of Clans API token to the constructor
ClashAPI clashAPI = new ClashAPI("token");

// 2. And do the requests you need. Yes, it's as simple :)
Player player = clashAPI.getPlayer("#AAAA00");

int townhallLevel = player.getTownHallLevel();
String clanRole = player.getRole();
List<Troop> heroes = player.getHeroes();
...
```

## What's the token?
In order to make calls to the Clash of Clans API, Supercell (developer of the game) asks you to sign up on [this website](https://developer.clashofclans.com/#/register). Then, head to your [profile](https://developer.clashofclans.com/#/account) and create a new key. Once you are done, the key will generate the token. Copy it and provide it to the `ClashAPI` constructor.

Though this token is linked to the IP address you gave, I would advise **not to hardcode it** inside your code, for safety sake. Paste it in a separate file that you would access from your code. It will prevent your token being spread if you ever share your files.

## I do not have a static Ip address, my tokens are not working.
This is a common limitation that many developers have to deal with, for that reason clash-api provides several ways to get tokens dynamically without having to 
hardcode them in your code as well as manage them manually. 

### How do I use this feature?
Clash Api provides several constructors that allow you to initialize your token dynamically.

Firstly we have a constructor that allows you to hardcode a token directly.

```java
ClashAPI client = new ClashAPI("token");
```

Next constructor expects you to enter your [clash of clans developer site](https://developer.clashofclans.com/#/register) username and password

```java
ClashAPI client = new ClashAPI("username", "password");
```

Finally, we have a constructor that allows you to enter multiple developer accounts 
```java
    List<Credentials> credentials = List.of(
            new Credentials("email", "password"),
            new Credentials("email", "password"),
            new Credentials("email", "password"),
            new Credentials("email", "password")
    );
    ClashAPI client = new ClashAPI(credentials);
```
to enter multiple accounts at once, we need a helper/tuple class to store the login details appropriately, 
hence the `Credentials` class, which you can instantiate with the example above.


### How does this work?
Glad you asked!<br/>
Clash API uses the [Clash of Clans API](https://developer.clashofclans.com/api-docs/v1/) to make requests to the API and on top of that it uses some hidden endpoints to make requests to login and manage user token. 

All the token are stored in a "Rotating" Mutex List which has a great benefit of 
being able to rotate through multiple tokens and avoid rate limt from the API 
(which is around 30-40 request/token), but due to the rotating token feature of clash Api with just 
4 accounts we are able to make 1600 request/ second with 40 tokens and with almost no error (
see: ENTER THE CODE EXAMPLE)

### How to make concurrent requests with Clash Api?


## Dependencies
* Kotlin serialization `1.3.1`
* OkHttp `4.9.3`
* java `11` or above

## Disclaimer
*This material is unofficial and is not endorsed by Supercell. For more information see Supercell's Fan Content Policy: www.supercell.com/fan-content-policy.*
