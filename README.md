# NavigationController
Android Jetpack comes with the Navigation architecture component, which simplifies the implementation of navigation in Android apps.

- Get rid of handling backstack 
- A navigation graph is a resource file that contains all of your destinations and actions. The graph represents all of your app's navigation paths.

The Navigation component is designed for apps that have one main activity with multiple fragment destinations. The main activity is associated with a navigation graph and contains a NavHostFragment that is responsible for swapping destinations as needed. In an app with multiple activity destinations, each activity has its own navigation graph.
