package movie

import com.google.inject.{Inject, Singleton}

@Singleton
class MovieConnector @Inject()(val awsMovieStore: AwsMovieStore) {
  def retrieveMovieById(id: String): Movie = awsMovieStore.getMovies.find(_.id == id).getOrElse(Movie(id, "NO MOVIE FOUND"))
}
