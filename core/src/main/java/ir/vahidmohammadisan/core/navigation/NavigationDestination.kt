package ir.vahidmohammadisan.core.navigation

sealed class NavigationDestination(
    val route: String,
) {
    data object Rockets : NavigationDestination("rocketsDestination")
    data object Back : NavigationDestination("navigationBack")
}
