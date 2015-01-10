$(document).ready(function(){
    var options = {
        autoPlay: true,
        autoPlayDelay: 4000,
        nextButton: true,
        prevButton: true,
        preloader: true,
        navigationSkip: false
    };
    var sequence = $("#sequence").sequence(options).data("sequence");

    sequence.afterLoaded = function(){
        $(".sequence-prev, .sequence-next").fadeIn(500);
    }
});