$(document).ready(function(){
    var options = {
        autoPlay: false,
        autoPlayDelay: 500,
        nextButton: true,
        prevButton: true,
        preloader: true,
        navigationSkip: false
    };
    var sequence = $("#sequence").sequence(options).data("sequence");

    sequence.afterLoaded = function(){
        $(".sequence-prev, .sequence-next").fadeIn(0);
    }
});