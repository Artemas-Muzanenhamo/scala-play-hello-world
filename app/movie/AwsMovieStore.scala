package movie

import com.google.inject.Singleton

@Singleton
class AwsMovieStore {
  def getMovies: Seq[Movie] =
    Seq(
      Movie("1", "James Bond - 007"),
      Movie("2", "Fast and Furious x"),
      Movie("3", "Mission Impossible 9"),
      Movie("4", "Lioness"),
      Movie("5", "Batman")
    )
}
