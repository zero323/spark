#' @section Reading and writing models:
#' \subsection{Writing}{
#' Spark ML models can written using \code{write.ml} function
#' \preformatted{
#' model <- <%= name %>(...)
#' write.ml(model, path)
#' }
#' }
#' \subsection{Reading}{
#' Saved model can be loaded
#' \preformatted{
#' model <- read.ml(path)
#' }
#' }
#'
#' @section Making predictions:
#' Trained model can used to make predictions
#' \preformatted{
#' predict(model, data)
#' }
