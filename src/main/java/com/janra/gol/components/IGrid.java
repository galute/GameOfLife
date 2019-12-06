/*
 * *****************************************************************************
 *
 * Copyright 2019: Refinitiv. All Rights Reserved.
 * This document contains information proprietary to Refinitiv
 * and may not be reproduced and/or used in whole or part without the express
 * written permission of Refinitiv.
 *
 * *****************************************************************************
 */
package com.janra.gol.components;

public interface IGrid
{
    Boolean isAlive(Integer X, Integer Y);
    Boolean isOnGrid(Integer X, Integer Y);
}
