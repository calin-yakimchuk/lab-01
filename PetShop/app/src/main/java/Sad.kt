class Sad(date: String): Mood(date)
{
    override fun getMood(): String {
        return "Sad"
    }
}